<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:ns="https://tatamotors.com/citi/api/1.0"
	xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">

	<xsl:template match="/I_ZFI_BANK_ECOLLECTION_CITI">
		<soap:Envelope>
			<soap:Header />
			<soap:Body>
				<ns:CITI_NOTIFICATION_APIResponse>
					<E_ACK />
					<I_ZFI_BANK_ECOLLECTION_CITI>
						<xsl:copy-of select="*" />
					</I_ZFI_BANK_ECOLLECTION_CITI>
				</ns:CITI_NOTIFICATION_APIResponse>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>

</xsl:stylesheet>

