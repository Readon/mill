import mill._, scalalib._

object mymillproject extends SbtModule {
  def scalaVersion = "2.13.8" // 选择你使用的 Scala 版本
  
  override def millSourcePath = os.pwd
//   def mainClass = Some("myapp")

  object test extends SbtModuleTests with TestModule.ScalaTest {
    def ivyDeps = Agg(
      ivy"org.scalatest::scalatest:3.2.19"
    )
  }
}
