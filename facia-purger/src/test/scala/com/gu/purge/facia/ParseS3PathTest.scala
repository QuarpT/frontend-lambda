package com.gu.purge.facia

import org.scalatest.{ FlatSpec, Matchers }

class ParseS3PathTest extends FlatSpec with Matchers {

  "S3 Path Parser" should "parse a front name without a slash" in {
    new FrontsS3PathParser("CODE", "CODE/frontsapi/pressed/live/au/fapi/pressed.json").run() should be(Some("au"))
  }

  it should "parse a front name with a slash" in {
    new FrontsS3PathParser("DEV", "DEV/frontsapi/pressed/live/au/sport/fapi/pressed.json").run() should be(Some("au/sport"))
  }

  it should "not parse when no front name is given" in {
    new FrontsS3PathParser("PROD", "PROD/frontsapi/pressed/live/fapi/pressed.json").run() should be(None)
  }

}
