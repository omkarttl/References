<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:urn="urn:sap-com:document:sap:rfc:functions"
	xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">

	<xsl:template match="/ZFIRFC_CUSTOMER_VALIDATION">
		<soap:Envelope>
			<soap:Header />
			<soap:Body>
				<urn:ZFIRFC_CUSTOMER_VALIDATION>
					<xsl:copy-of select="*" />
				</urn:ZFIRFC_CUSTOMER_VALIDATION>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
	
	<xsl:template match="/ZFIRFC_YES_BANK_DOC_POSTING">
		<soap:Envelope>
			<soap:Header />
			<soap:Body>
				<urn:ZFIRFC_YES_BANK_DOC_POSTING>
					<xsl:copy-of select="*" />
				</urn:ZFIRFC_YES_BANK_DOC_POSTING>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>

</xsl:stylesheet>

