package controllers

import play.api._
import play.api.mvc._
import play.api.mvc.Flash
import play.api.data.Form
import play.api.data.Forms._
import play.api.i18n.Messages
import play.mvc.Http.MultipartFormData
import play.mvc.Http.MultipartFormData._

import models.User
import models.Destination

object Submissions extends Controller {
  def submit = Action { request =>
    request.session.get("connected").map { username =>
      Ok(views.html.submission(username))
    }.getOrElse {
      Ok(views.html.badRequest(Messages("bad.request.not.connected")))
    }
  }
}