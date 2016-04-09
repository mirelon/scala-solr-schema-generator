# Scala Solr schema generator
Generate Solr schema from Scala classes. Easy integration with SolrJ.

## Usage
```scala
import solr.{Document, Field}

class Book extends Document {
  def fields = Map(
    "title" -> Field(name = "title", _type = "string", indexed = true, stored = true, required = true, multiValued = false),
    "autor" -> Field(name = "author", _type = "string", indexed = true, stored = true, required = true, multiValued = true)
  )
}
```
