package net.liftmodules.imapidle

/** Command-line test harness. */
object TestApp extends App {

	args match {
		
		case Array(user,password,host) => ImapIdle.init(user,password,host) { m: javax.mail.Message => 
			println("Got "+EmailUtils.dump(m))
			true
		}

		case otherwise => println("Usage: username password host")
	}

}