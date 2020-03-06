<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:urn="urn:sap-com:document:sap:rfc:functions"
	xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">

	<xsl:template match="/ZFIRFC_BANK_ECOLLECTION_CITI">
		<soap:Envelope>
			<soap:Header />
			<soap:Body>
				<urn:ZFIRFC_BANK_ECOLLECTION_CITI>
					<xsl:copy-of select="*" />
				</urn:ZFIRFC_BANK_ECOLLECTION_CITI>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>

</xsl:stylesheet>

