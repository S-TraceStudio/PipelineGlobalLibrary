import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

def call( String messageTitle, String messageFallback, String buildNumber, String gitBranch, String gitCommit, String textColor) 
{
    def attachmenPayload = [[
        fallback: messageFallback,
        color: textColor,
        fields:[
            [
                title: messageTitle,
                value: buildNumber,
                short: false
            ],
            [  
                title: "Git Branch",
                value: gitBranch,
                short: true
            ],
            [  
                title: "Git Commit Version",
                value: gitCommit,
                short: true
            ]
        ]
    ]]

    slackSend(channel: '#jenkins', color: textColor, attachments: new JsonBuilder(attachmenPayload).toPrettyString() )
}
