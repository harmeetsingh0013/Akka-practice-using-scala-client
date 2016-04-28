package com.harmeetsingh13.chapter2

import java.io.File

import akka.actor.ActorSystem
import akka.util.Timeout
import com.harmeetsingh13.chapter2.messages.{GetRequest, SetRequest}
import com.typesafe.config.ConfigFactory
import scala.concurrent.duration._
import akka.pattern.ask

/**
 * Created by Harmeet Singh(Taara) on 26/4/16.
 * @version 1.0
 */
class SClient(remoteIp: String) {

  private implicit val timeout = Timeout(10 seconds)
  private implicit val system = ActorSystem("Localsystem")
  private val remoteAddress = s"akka.tcp://SimpleClientServer@$remoteIp/user/akkademy-db";
  private val remoteDb = system.actorSelection(remoteAddress)

  def set(key: String, value: Object) = {
    remoteDb ? SetRequest(key, value)
  }

  def get(key: String) = {
    remoteDb ? GetRequest(key)
  }
}
