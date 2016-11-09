/**
  * Created by Rajarshi on 10/11/16.
  */

import java.io.File


object parser {
  def main(args: Array[String]): Unit = {

    val FILE_PATH = "/Users/Ritabhari/PycharmProjects/parser-D"
    val folders = getListOfFiles(FILE_PATH).head
    //    print(files)
    val filenameArray = folders.toString.split("/")
    val file = filenameArray(filenameArray.length - 1)
    print(file)


  }

  def getListOfFiles(dir: String): List[File] = {
    val d = new File(dir)
    if (d.exists && d.isDirectory) {
      //      val files = d.listFiles.filter(_.isFile).toList
      val folders = d.listFiles.filter(_.isDirectory).toList
      //      (files, folders)
      folders
    } else {
      //      (List[File](), List[File]())
      List[File]()
    }
  }

  //  def getListOfSubDirectories(directoryName: String): Array[String] = {
  //    return (new File(directoryName)).listFiles.filter(_.isDirectory).map(_.getName)
  //  }

}
