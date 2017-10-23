package io.github.mschonaker.kotlin

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import javax.servlet.annotation.WebServlet

@WebServlet("/*")
class HelloServlet : HttpServlet() {

	override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {

		val message = Backend.sayHello(request.getParameter("name") ?: "you")

		response.setHeader("Content-Type", "text/plain")
		response.writer.write(message)
	}
}