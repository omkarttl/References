<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:urn="urn:sap-com:document:sap:soap:functions:mc-style"
	xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">

	<xsl:template match="@*|node()">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()" />
		</xsl:copy>
	</xsl:template>

	<xsl:template match="BU|OrderReason|ReqDate|OrderId" />

	<xsl:template match="/ZsdrfcCreateSalesOrderResponse">
		<soapenv:Envelope>
			<soapenv:Header />
			<soapenv:Body>
				<urn:ZsdrfcCreateSalesOrderResponse>
					<xsl:copy-of select="*" />
				</urn:ZsdrfcCreateSalesOrderResponse>
			</soapenv:Body>
		</soapenv:Envelope>
	</xsl:template>

</xsl:stylesheet>