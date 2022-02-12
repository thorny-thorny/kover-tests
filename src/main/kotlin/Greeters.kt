class Greeter {
  constructor(
    name: String,
  ) {
    println(name)
  }
}

class GreeterWithOptional {
  constructor(
    name: String = "world",
  ) {
    println(name)
  }
}

class JvmGreeterWithOptional {
  @JvmOverloads
  constructor(
    name: String = "world",
  ) {
    println(name)
  }
}
