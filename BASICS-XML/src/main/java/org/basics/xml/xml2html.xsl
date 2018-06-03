<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html" indent="yes"/>
	
	<xsl:template match="/">
	   <html>
	       <body>
	   	       <xsl:apply-templates/>
	       </body>
	   </html>
	</xsl:template>

	<xsl:template match="persons">
	    <table border="2" width="50%">
	        <xsl:for-each select="person">
	            <tr>
	                <td><i><xsl:value-of select="firstname"/></i></td>
	                <td><xsl:value-of select="lastname"/></td>
	                <td><xsl:value-of select="age"/></td>
	            </tr>
	        </xsl:for-each>
	    </table>
	</xsl:template>
	
</xsl:stylesheet>