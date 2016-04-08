package solr

/**
  * @author miso
  */
trait Field {
  def name: String
  def indexed: Boolean
  def stored: Boolean
  def required: Boolean
  def multivalued: Boolean
  def _type: String

  def toSchema: xml.Elem = <field name="{ name }" type="{ _type }" indexed="{ indexed }" stored="{ stored }" required="{ required }" />
}
