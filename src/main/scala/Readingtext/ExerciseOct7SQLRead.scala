package Readingtext

object ExerciseOct7SQLRead extends App {
  val dbPath = "./src/resources/db/chinook.db"
  val url = "jdbc:sqlite:"+dbPath
  import java.sql.DriverManager

  val conn = DriverManager.getConnection(url)

  val statement = conn.createStatement()

  val tableName = "artists"

  //connect to database and extract ALL artist data into an Array of Artist case class
  val sql =
    s"""
       |SELECT * FROM $tableName
       |""".stripMargin
  val resultSet = statement.executeQuery(sql)
  val artistBuffer = scala.collection.mutable.ListBuffer.empty[Artist]
  while ( resultSet.next() ) {
    val artist = Artist(resultSet.getInt("ArtistId"), resultSet.getString("Name"))
    artistBuffer.append(artist)
  }
  val artistCollection = artistBuffer.toArray
  artistCollection.slice(0,20).foreach(println)


}
