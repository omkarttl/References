<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:ns="https://tatamotors.com/citi/api/1.0"
	xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">

	<xsl:template match="/ArrayList">
		<soapenv:Envelope>
			<soapenv:Header />
			<soapenv:Body>
				<ns:ACCOUNT_EXTRACT_RESPONSE>
						<xsl:copy-of select="*" />
				</ns:ACCOUNT_EXTRACT_RESPONSE>
			</soapenv:Body>
		</soapenv:Envelope>
	</xsl:template>

</xsl:stylesheet>

