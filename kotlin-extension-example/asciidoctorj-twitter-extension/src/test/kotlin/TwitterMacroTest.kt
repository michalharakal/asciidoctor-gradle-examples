package com.puravida.asciidoctor.barcode

import org.junit.Test
import java.io.File

class BarCodeBlockTests {
    @Test
    fun code128() {
        val attributes: Map<String, Any> = HashMap()
        val options: org.asciidoctor.Options = org.asciidoctor.Options()
        options.setHeaderFooter(true)
        options.setSafe(SafeMode.SERVER)
        options.setToDir(File("build").absolutePath)
        options.setOption("mkdirs", "true")
        options.setOption("imagesoutdir", "build")
        options.setToFile("code128.html")
        options.setAttributes(attributes)
        val asciidoctor: Asciidoctor = Asciidoctor.Factory.create()
        asciidoctor.convert(String.format("= My document\n\n" + "preambulo \n" + "----\n" + "barcode::codabar[123456]\n" + "----\n" + "footer \n" + ""), options)
    }

    @Test
    fun qrcode() {
        val attributes: Map<String, Any> = HashMap()
        val options: org.asciidoctor.Options = org.asciidoctor.Options()
        options.setHeaderFooter(true)
        options.setSafe(SafeMode.SERVER)
        options.setToDir(File("build").absolutePath)
        options.setOption("mkdirs", "true")
        options.setOption("imagesoutdir", "build")
        options.setToFile("qrcode.html")
        options.setAttributes(attributes)
        val asciidoctor: Asciidoctor = Asciidoctor.Factory.create()
        asciidoctor.convert(String.format("= My document\n\n" + "preambulo \n" + "----\n" + "barcode::qrcode[http://puravida-software.com,300,300,FFAABB00,00FF9900]\n" + "----\n" + "footer \n" + ""), options)
    }
}