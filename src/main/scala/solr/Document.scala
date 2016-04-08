package solr

import scala.xml.NodeBuffer

/**
  * @author miso
  */
trait Document {
  def schemaName: String
  def fields: Map[String, Field]

  def toSchema: NodeBuffer =
    <?xml version="1.0" encoding="UTF-8" ?>
    <schema name="{ schema_name }" version="0.1">
      <xi:include href="fieldTypes.xml" xmlns:xi="http://www.w3.org/2001/XInclude" />
      <fields>
        { fields.mapValues(_.toSchema) }
      </fields>
    </schema>
}
