import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

def call( String messageTitle, String messageText, String textColor) 
{
    def attachmenPayload = [[
        fallback: "Project execution",
        color: textColor,
        fields:[
            [
                title: "Project",
                value: "Build",
                short: false
            ],
            [  
                title: "Branch",
                value: "Branch Name",
                short: true
            ],
            [  
                title: "Environment",
                value: "abc:xyz",
                short: true
            ]
        ]
    ]]

    slackSend(color: textColor, attachments: new JsonBuilder(attachmenPayload).toPrettyString() )
}
