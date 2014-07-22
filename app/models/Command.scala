package models

import sys.process._
import language.postfixOps

object Command {
  // Execute command
  // Execute the command in the workingDirectory
  def exec(command: Seq[String])(workingDirectory: String): String = {
    val output = Process(command,
      new java.io.File(workingDirectory)).!!
    
    output
  }

  // List directory contents
  // List all files in the workingDirectory
  def ls(workingDirectory: String): String = {
    val output = Process(Seq("ls"),
      new java.io.File(workingDirectory)).!!
    
    output
  }

  def lsWithOpts(fileOptions: String)(workingDirectory: String) = {
    val outputs = ls(workingDirectory)
    val filesArray = outputs.split("\n")

    val output = 
      for (file <- filesArray if file.startsWith(fileOptions)) yield file

    output.mkString("\n")
  }

  // Change file mode bit
  // Change file of filenames that ends with fileOptions to the chmodOption
  // in the workingDirectory
  def chmod(chmodOption: String)(files: String)(fileOptions: String)(workingDirectory: String) = {
    val filesArray = files.split("\n")
    for (file <- filesArray if file.endsWith(fileOptions)) {
      Process(Seq("chmod", chmodOption, file),
        new java.io.File(workingDirectory)).!!
    }

    filesArray
  }

  def sh(script: String)(args: String)(workingDirectory: String) = {
    val output = ("./" + script + " " + args).!!

    output
  }
}