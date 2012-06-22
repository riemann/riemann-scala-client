package com.aphyr.riemann.scala

import com.aphyr.riemann.client.RiemannClient

trait RiemannReporting {
  private lazy val riemannClient = RiemannClient.getClient()

  def riemann = riemannClient
}