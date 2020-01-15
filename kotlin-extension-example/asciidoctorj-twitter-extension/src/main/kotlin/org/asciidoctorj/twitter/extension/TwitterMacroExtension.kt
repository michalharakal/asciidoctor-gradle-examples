package org.asciidoctorj.twitter.extension

import org.asciidoctor.Asciidoctor
import org.asciidoctor.jruby.extension.spi.ExtensionRegistry

class TwitterMacroExtension : ExtensionRegistry {
    override fun register(asciidoctor: Asciidoctor) {
        val javaExtensionRegistry = asciidoctor.javaExtensionRegistry()
        javaExtensionRegistry.inlineMacro("twitter", TwitterMacro::class.java)
    }
}
