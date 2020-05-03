import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

def call(String titleText, String messageText, String textColor) 
{
    slackSend color: textColor, message: messageText, title: titleText
}
