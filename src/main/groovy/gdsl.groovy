
//The global script scope
def ctx = context(scope: scriptScope())
contributor(ctx) {
    method(name: 'parallel', type: 'Object', params: ['closures':'java.util.Map'], doc: 'Execute in parallel')
    method(name: 'parallel', type: 'Object', namedParams: [parameter(name: 'closures', type: 'java.util.Map'), parameter(name: 'failFast', type: 'boolean'), ], doc: 'Execute in parallel')
    method(name: 'build', type: 'Object', params: [job:'java.lang.String'], doc: 'Build a job')
    method(name: 'build', type: 'Object', namedParams: [parameter(name: 'job', type: 'java.lang.String'), parameter(name: 'parameters', type: 'java.util.List'), parameter(name: 'propagate', type: 'boolean'), parameter(name: 'quietPeriod', type: 'java.lang.Integer'), parameter(name: 'wait', type: 'boolean'), ], doc: 'Build a job')
    method(name: 'catchError', type: 'Object', params: [body:'Closure'], doc: 'Catch error and set build result to failure')
    method(name: 'catchError', type: 'Object', params: [body:Closure], namedParams: [parameter(name: 'buildResult', type: 'java.lang.String'), parameter(name: 'catchInterruptions', type: 'boolean'), parameter(name: 'message', type: 'java.lang.String'), parameter(name: 'stageResult', type: 'java.lang.String'), ], doc: 'Catch error and set build result to failure')
    method(name: 'echo', type: 'Object', params: [message:'java.lang.String'], doc: 'Print Message')
    method(name: 'emailext', type: 'Object', namedParams: [parameter(name: 'subject', type: 'java.lang.String'), parameter(name: 'body', type: 'java.lang.String'), parameter(name: 'attachLog', type: 'boolean'), parameter(name: 'attachmentsPattern', type: 'java.lang.String'), parameter(name: 'compressLog', type: 'boolean'), parameter(name: 'from', type: 'java.lang.String'), parameter(name: 'mimeType', type: 'java.lang.String'), parameter(name: 'postsendScript', type: 'java.lang.String'), parameter(name: 'presendScript', type: 'java.lang.String'), parameter(name: 'recipientProviders', type: 'java.util.List'), parameter(name: 'replyTo', type: 'java.lang.String'), parameter(name: 'saveOutput', type: 'boolean'), parameter(name: 'to', type: 'java.lang.String'), ], doc: 'Extended Email')
    method(name: 'emailextrecipients', type: 'Object', params: [recipientProviders:'java.util.List'], doc: 'Extended Email Recipients')
    method(name: 'error', type: 'Object', params: [message:'java.lang.String'], doc: 'Error signal')
    method(name: 'findBuildScans', type: 'Object', params: [:], doc: 'Find published build scans')
    method(name: 'input', type: 'Object', params: [message:'java.lang.String'], doc: '\u7B49\u5F85\u4EA4\u4E92\u5F0F\u8F93\u5165')
    method(name: 'input', type: 'Object', namedParams: [parameter(name: 'message', type: 'java.lang.String'), parameter(name: 'id', type: 'java.lang.String'), parameter(name: 'ok', type: 'java.lang.String'), parameter(name: 'parameters', type: 'java.util.List'), parameter(name: 'submitter', type: 'java.lang.String'), parameter(name: 'submitterParameter', type: 'java.lang.String'), ], doc: '\u7B49\u5F85\u4EA4\u4E92\u5F0F\u8F93\u5165')
    method(name: 'isUnix', type: 'Object', params: [:], doc: 'Checks if running on a Unix-like node')
    method(name: 'library', type: 'Object', params: [identifier:'java.lang.String'], doc: 'Load a library on the fly')
    method(name: 'library', type: 'Object', namedParams: [parameter(name: 'identifier', type: 'java.lang.String'), parameter(name: 'changelog', type: 'java.lang.Boolean'), parameter(name: 'retriever', type: 'Map'), ], doc: 'Load a library on the fly')
    method(name: 'libraryResource', type: 'Object', params: [resource:'java.lang.String'], doc: 'Load a resource file from a library')
    method(name: 'libraryResource', type: 'Object', namedParams: [parameter(name: 'resource', type: 'java.lang.String'), parameter(name: 'encoding', type: 'java.lang.String'), ], doc: 'Load a resource file from a library')
    method(name: 'mail', type: 'Object', namedParams: [parameter(name: 'subject', type: 'java.lang.String'), parameter(name: 'body', type: 'java.lang.String'), parameter(name: 'bcc', type: 'java.lang.String'), parameter(name: 'cc', type: 'java.lang.String'), parameter(name: 'charset', type: 'java.lang.String'), parameter(name: 'from', type: 'java.lang.String'), parameter(name: 'mimeType', type: 'java.lang.String'), parameter(name: 'replyTo', type: 'java.lang.String'), parameter(name: 'to', type: 'java.lang.String'), ], doc: 'Mail')
    method(name: 'milestone', type: 'Object', params: [ordinal:'java.lang.Integer'], doc: 'The milestone step forces all builds to go through in order')
    method(name: 'milestone', type: 'Object', namedParams: [parameter(name: 'ordinal', type: 'java.lang.Integer'), parameter(name: 'label', type: 'java.lang.String'), parameter(name: 'unsafe', type: 'boolean'), ], doc: 'The milestone step forces all builds to go through in order')
    method(name: 'node', type: 'Object', params: [label:java.lang.String, body:'Closure'], doc: 'Allocate node')
    method(name: 'properties', type: 'Object', params: [properties:'java.util.List'], doc: 'Set job properties')
    method(name: 'publishChecks', type: 'Object', params: [:], doc: 'Publish customized checks to SCM platforms')
    method(name: 'publishChecks', type: 'Object', namedParams: [parameter(name: 'actions', type: 'java.util.List'), parameter(name: 'annotations', type: 'java.util.List'), parameter(name: 'conclusion', type: 'Map'), parameter(name: 'detailsURL', type: 'java.lang.String'), parameter(name: 'name', type: 'java.lang.String'), parameter(name: 'status', type: 'Map'), parameter(name: 'summary', type: 'java.lang.String'), parameter(name: 'text', type: 'java.lang.String'), parameter(name: 'title', type: 'java.lang.String'), ], doc: 'Publish customized checks to SCM platforms')
    method(name: 'readTrusted', type: 'Object', params: [path:'java.lang.String'], doc: 'Read trusted file from SCM')
    method(name: 'resolveScm', type: 'Object', namedParams: [parameter(name: 'source', type: 'Map'), parameter(name: 'targets', type: 'java.util.List'), parameter(name: 'ignoreErrors', type: 'boolean'), ], doc: 'Resolves an SCM from an SCM Source and a list of candidate target branch names')
    method(name: 'retry', type: 'Object', params: [count:int, body:'Closure'], doc: 'Retry the body up to N times')
    method(name: 'retry', type: 'Object', params: [body:Closure], namedParams: [parameter(name: 'count', type: 'int'), parameter(name: 'conditions', type: 'java.util.List'), ], doc: 'Retry the body up to N times')
    method(name: 'script', type: 'Object', params: [body:'Closure'], doc: 'Run arbitrary Pipeline script')
    method(name: 'sleep', type: 'Object', params: [time:'int'], doc: 'Sleep')
    method(name: 'sleep', type: 'Object', namedParams: [parameter(name: 'time', type: 'int'), parameter(name: 'unit', type: 'java.util.concurrent.TimeUnit'), ], doc: 'Sleep')
    method(name: 'stage', type: 'Object', params: [name:java.lang.String, body:'Closure'], doc: 'Stage')
    method(name: 'stage', type: 'Object', params: [body:Closure], namedParams: [parameter(name: 'name', type: 'java.lang.String'), parameter(name: 'concurrency', type: 'java.lang.Integer'), ], doc: 'Stage')
    method(name: 'step', type: 'Object', params: [delegate:'Map'], doc: 'General Build Step')
    method(name: 'timeout', type: 'Object', params: [time:int, body:'Closure'], doc: 'Enforce time limit')
    method(name: 'timeout', type: 'Object', params: [body:Closure], namedParams: [parameter(name: 'time', type: 'int'), parameter(name: 'activity', type: 'boolean'), parameter(name: 'unit', type: 'java.util.concurrent.TimeUnit'), ], doc: 'Enforce time limit')
    method(name: 'timestamps', type: 'Object', params: [body:'Closure'], doc: 'Timestamps')
    method(name: 'tool', type: 'Object', params: [name:'java.lang.String'], doc: 'Use a tool from a predefined Tool Installation')
    method(name: 'tool', type: 'Object', namedParams: [parameter(name: 'name', type: 'java.lang.String'), parameter(name: 'type', type: 'java.lang.String'), ], doc: 'Use a tool from a predefined Tool Installation')
    method(name: 'unstable', type: 'Object', params: [message:'java.lang.String'], doc: 'Set stage result to unstable')
    method(name: 'waitUntil', type: 'Object', params: [body:'Closure'], doc: 'Wait for condition')
    method(name: 'waitUntil', type: 'Object', params: [body:Closure], namedParams: [parameter(name: 'initialRecurrencePeriod', type: 'long'), parameter(name: 'quiet', type: 'boolean'), ], doc: 'Wait for condition')
    method(name: 'warnError', type: 'Object', params: [message:java.lang.String, body:'Closure'], doc: 'Catch error and set build and stage result to unstable')
    method(name: 'warnError', type: 'Object', params: [body:Closure], namedParams: [parameter(name: 'message', type: 'java.lang.String'), parameter(name: 'catchInterruptions', type: 'boolean'), ], doc: 'Catch error and set build and stage result to unstable')
    method(name: 'withChecks', type: 'Object', params: [name:java.lang.String, body:'Closure'], doc: 'Inject checks properties into its closure')
    method(name: 'withCredentials', type: 'Object', params: [bindings:java.util.List, body:'Closure'], doc: 'Bind credentials to variables')
    method(name: 'withEnv', type: 'Object', params: [overrides:java.util.List, body:'Closure'], doc: 'Set environment variables')
    method(name: 'wrap', type: 'Object', params: [delegate:Map, body:'Closure'], doc: 'General Build Wrapper')
    method(name: 'ws', type: 'Object', params: [dir:java.lang.String, body:'Closure'], doc: 'Allocate workspace')
    method(name: 'dockerFingerprintRun', type: 'Object', params: [containerId:'java.lang.String'], doc: 'Advanced/Deprecated Record trace of a Docker image run in a container')
    method(name: 'dockerFingerprintRun', type: 'Object', namedParams: [parameter(name: 'containerId', type: 'java.lang.String'), parameter(name: 'toolName', type: 'java.lang.String'), ], doc: 'Record trace of a Docker image run in a container')
    method(name: 'envVarsForTool', type: 'Object', namedParams: [parameter(name: 'toolId', type: 'java.lang.String'), parameter(name: 'toolVersion', type: 'java.lang.String'), ], doc: 'Fetches the environment variables for a given tool in a list of \'FOO=bar\' strings suitable for the withEnv step.')
    method(name: 'getContext', type: 'Object', params: [type:'Map'], doc: 'Advanced/Deprecated Get contextual object from internal APIs')
    method(name: 'withContext', type: 'Object', params: [context:java.lang.Object, body:'Closure'], doc: 'Advanced/Deprecated Use contextual object from internal APIs within a block')
    property(name: 'docker', type: 'org.jenkinsci.plugins.docker.workflow.DockerDSL')
    property(name: 'pipeline', type: 'org.jenkinsci.plugins.pipeline.modeldefinition.ModelStepLoader')
    property(name: 'env', type: 'org.jenkinsci.plugins.workflow.cps.EnvActionImpl.Binder')
    property(name: 'params', type: 'org.jenkinsci.plugins.workflow.cps.ParamsVariable')
    property(name: 'currentBuild', type: 'org.jenkinsci.plugins.workflow.cps.RunWrapperBinder')
    property(name: 'scm', type: 'org.jenkinsci.plugins.workflow.multibranch.SCMVar')
}
//Steps that require a node context
def nodeCtx = context(scope: closureScope())
contributor(nodeCtx) {
    def call = enclosingCall('node')
    if (call) {
        method(name: 'bat', type: 'Object', params: [script:'java.lang.String'], doc: 'Windows Batch Script')
        method(name: 'bat', type: 'Object', namedParams: [parameter(name: 'script', type: 'java.lang.String'), parameter(name: 'encoding', type: 'java.lang.String'), parameter(name: 'label', type: 'java.lang.String'), parameter(name: 'returnStatus', type: 'boolean'), parameter(name: 'returnStdout', type: 'boolean'), ], doc: 'Windows Batch Script')
        method(name: 'checkout', type: 'Object', params: [scm:'Map'], doc: 'Check out from version control')
        method(name: 'checkout', type: 'Object', namedParams: [parameter(name: 'scm', type: 'Map'), parameter(name: 'changelog', type: 'boolean'), parameter(name: 'poll', type: 'boolean'), ], doc: 'Check out from version control')
        method(name: 'deleteDir', type: 'Object', params: [:], doc: 'Recursively delete the current directory from the workspace')
        method(name: 'dir', type: 'Object', params: [path:java.lang.String, body:'Closure'], doc: 'Change current directory')
        method(name: 'fileExists', type: 'Object', params: [file:'java.lang.String'], doc: 'Verify if file exists in workspace')
        method(name: 'git', type: 'Object', params: [url:'java.lang.String'], doc: 'Git')
        method(name: 'git', type: 'Object', namedParams: [parameter(name: 'url', type: 'java.lang.String'), parameter(name: 'branch', type: 'java.lang.String'), parameter(name: 'changelog', type: 'boolean'), parameter(name: 'credentialsId', type: 'java.lang.String'), parameter(name: 'poll', type: 'boolean'), ], doc: 'Git')
        method(name: 'junit', type: 'Object', params: [testResults:'java.lang.String'], doc: 'Archive JUnit-formatted test results')
        method(name: 'junit', type: 'Object', namedParams: [parameter(name: 'testResults', type: 'java.lang.String'), parameter(name: 'allowEmptyResults', type: 'boolean'), parameter(name: 'checksName', type: 'java.lang.String'), parameter(name: 'healthScaleFactor', type: 'double'), parameter(name: 'keepLongStdio', type: 'boolean'), parameter(name: 'skipMarkingBuildUnstable', type: 'boolean'), parameter(name: 'skipOldReports', type: 'boolean'), parameter(name: 'skipPublishingChecks', type: 'boolean'), parameter(name: 'testDataPublishers', type: 'java.util.List'), ], doc: 'Archive JUnit-formatted test results')
        method(name: 'load', type: 'Object', params: [path:'java.lang.String'], doc: 'Evaluate a Groovy source file into the Pipeline script')
        method(name: 'powershell', type: 'Object', params: [script:'java.lang.String'], doc: 'Windows PowerShell Script')
        method(name: 'powershell', type: 'Object', namedParams: [parameter(name: 'script', type: 'java.lang.String'), parameter(name: 'encoding', type: 'java.lang.String'), parameter(name: 'label', type: 'java.lang.String'), parameter(name: 'returnStatus', type: 'boolean'), parameter(name: 'returnStdout', type: 'boolean'), ], doc: 'Windows PowerShell Script')
        method(name: 'publishHTML', type: 'Object', params: [target:'Map'], doc: 'Publish HTML reports')
        method(name: 'pwd', type: 'Object', params: [:], doc: 'Determine current directory')
        method(name: 'pwd', type: 'Object', namedParams: [parameter(name: 'tmp', type: 'boolean'), ], doc: 'Determine current directory')
        method(name: 'pwsh', type: 'Object', params: [script:'java.lang.String'], doc: 'PowerShell Core Script')
        method(name: 'pwsh', type: 'Object', namedParams: [parameter(name: 'script', type: 'java.lang.String'), parameter(name: 'encoding', type: 'java.lang.String'), parameter(name: 'label', type: 'java.lang.String'), parameter(name: 'returnStatus', type: 'boolean'), parameter(name: 'returnStdout', type: 'boolean'), ], doc: 'PowerShell Core Script')
        method(name: 'readFile', type: 'Object', params: [file:'java.lang.String'], doc: 'Read file from workspace')
        method(name: 'readFile', type: 'Object', namedParams: [parameter(name: 'file', type: 'java.lang.String'), parameter(name: 'encoding', type: 'java.lang.String'), ], doc: 'Read file from workspace')
        method(name: 'sh', type: 'Object', params: [script:'java.lang.String'], doc: 'Shell Script')
        method(name: 'sh', type: 'Object', namedParams: [parameter(name: 'script', type: 'java.lang.String'), parameter(name: 'encoding', type: 'java.lang.String'), parameter(name: 'label', type: 'java.lang.String'), parameter(name: 'returnStatus', type: 'boolean'), parameter(name: 'returnStdout', type: 'boolean'), ], doc: 'Shell Script')
        method(name: 'stash', type: 'Object', params: [name:'java.lang.String'], doc: 'Stash some files to be used later in the build')
        method(name: 'stash', type: 'Object', namedParams: [parameter(name: 'name', type: 'java.lang.String'), parameter(name: 'allowEmpty', type: 'boolean'), parameter(name: 'excludes', type: 'java.lang.String'), parameter(name: 'includes', type: 'java.lang.String'), parameter(name: 'useDefaultExcludes', type: 'boolean'), ], doc: 'Stash some files to be used later in the build')
        method(name: 'tm', type: 'Object', params: [stringWithMacro:'java.lang.String'], doc: 'Expand a string containing macros')
        method(name: 'unstash', type: 'Object', params: [name:'java.lang.String'], doc: 'Restore files previously stashed')
        method(name: 'validateDeclarativePipeline', type: 'Object', params: [path:'java.lang.String'], doc: 'Validate a file containing a Declarative Pipeline')
        method(name: 'withGradle', type: 'Object', params: [body:'Closure'], doc: 'WithGradle')
        method(name: 'writeFile', type: 'Object', namedParams: [parameter(name: 'file', type: 'java.lang.String'), parameter(name: 'text', type: 'java.lang.String'), parameter(name: 'encoding', type: 'java.lang.String'), ], doc: 'Write file to workspace')
        method(name: 'archive', type: 'Object', params: [includes:'java.lang.String'], doc: 'Advanced/Deprecated Archive artifacts')
        method(name: 'archive', type: 'Object', namedParams: [parameter(name: 'includes', type: 'java.lang.String'), parameter(name: 'excludes', type: 'java.lang.String'), ], doc: 'Archive artifacts')
        method(name: 'dockerFingerprintFrom', type: 'Object', namedParams: [parameter(name: 'dockerfile', type: 'java.lang.String'), parameter(name: 'image', type: 'java.lang.String'), parameter(name: 'commandLine', type: 'java.lang.String'), parameter(name: 'toolName', type: 'java.lang.String'), ], doc: 'Record trace of a Docker image used in FROM')
        method(name: 'unarchive', type: 'Object', params: [:], doc: 'Advanced/Deprecated Copy archived artifacts into the workspace')
        method(name: 'unarchive', type: 'Object', namedParams: [parameter(name: 'mapping', type: 'java.util.Map'), ], doc: 'Copy archived artifacts into the workspace')
        method(name: 'withDockerContainer', type: 'Object', params: [image:java.lang.String, body:'Closure'], doc: 'Advanced/Deprecated Run build steps inside a Docker container')
        method(name: 'withDockerContainer', type: 'Object', params: [body:Closure], namedParams: [parameter(name: 'image', type: 'java.lang.String'), parameter(name: 'args', type: 'java.lang.String'), parameter(name: 'toolName', type: 'java.lang.String'), ], doc: 'Run build steps inside a Docker container')
        method(name: 'withDockerRegistry', type: 'Object', params: [registry:Map, body:'Closure'], doc: 'Advanced/Deprecated Sets up Docker registry endpoint')
        method(name: 'withDockerRegistry', type: 'Object', params: [body:Closure], namedParams: [parameter(name: 'registry', type: 'Map'), parameter(name: 'toolName', type: 'java.lang.String'), ], doc: 'Sets up Docker registry endpoint')
        method(name: 'withDockerServer', type: 'Object', params: [server:Map, body:'Closure'], doc: 'Advanced/Deprecated Sets up Docker server endpoint')
    }
}

// Errors on:
