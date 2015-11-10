package springnz.sparkplug.examples

trait WeatherDataJoinTestPipeline extends WeatherDataJoinPipeline {
  import springnz.sparkplug.testkit.TestExtensions._
  override lazy val rawWeatherDataSource = super.rawWeatherDataSource.sourceFrom("RawWeatherData")
  override lazy val stationSource = super.stationSource.sourceFrom("StationData")
}
