
import scala.io.Source

class ReadFile {

  def readFromFile(file: String): Array[String] = {
      val bufferedSource = Source.fromFile(file)
      val lines = bufferedSource.getLines().toArray
      bufferedSource.close()
      lines
  }




}
