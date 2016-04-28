package com.harmeetsingh13.chapter2

import org.scalatest.{Matchers, FunSpecLike}
import scala.concurrent.Await
import scala.concurrent.duration._

/**
 * Created by Harmeet Singh(Taara) on 26/4/16.
 * @version 1.0
 */
class SClientIntegrationSpec extends FunSpecLike with Matchers {

  val client = new SClient("127.0.0.1:2552")
  describe("akkadment-db-client"){
    it("should set a value"){
      client.set("jame", new Integer(1313))
      val futureResult = client.get("james")
      val result = Await.result(futureResult, 10 seconds)
      result should equal (1313)
    }
  }
}
