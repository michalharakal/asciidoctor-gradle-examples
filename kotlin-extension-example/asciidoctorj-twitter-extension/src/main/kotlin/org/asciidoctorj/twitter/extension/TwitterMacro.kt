package org.asciidoctorj.twitter.extension

import org.asciidoctor.ast.ContentNode
import org.asciidoctor.extension.InlineMacroProcessor

class TwitterMacro(macroName: String?) : InlineMacroProcessor(macroName) {
    override fun process(contentNode: ContentNode, twitterHandle: String, attributes: Map<String, Any>): Any {
        val twitterLink: String
        val twitterLinkText: String
        if (twitterHandle.isEmpty()) {
            twitterLink = "http://www.twitter.com/"
            twitterLinkText = "Twitter"
        } else {
            twitterLink = "http://www.twitter.com/$twitterHandle"
            // Prepend twitterHandle with @ as text link:
            twitterLinkText = "@$twitterHandle"
        }
        // Define options for an 'anchor' element:
        val options: MutableMap<String, Any> = HashMap()
        options["type"] = ":link"
        options["target"] = twitterLink
        // Create the 'anchor' node:
        val inlineTwitterLink = createPhraseNode(contentNode, "anchor", twitterLinkText, attributes, options)
        // Convert to String value:
        return inlineTwitterLink.convert()
    }
}
