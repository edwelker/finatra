package com.twitter.inject.tests.thrift.utils

import com.twitter.inject.WordSpecTest
import com.twitter.inject.thrift.utils.ThriftMethodUtils
import com.twitter.scrooge.{ThriftStructCodec3, ThriftMethod}

class ThriftMethodUtilsTest extends WordSpecTest {

  "ThriftMethodUtils" should {

    "return pretty string" in {

      val method = new ThriftMethod {
        override val name = "Foo"

        /** Thrift annotations (user-defined key-value metadata) on the method */
        override def annotations: Map[String, String] = ???

        /** Convert a function implementation of this method into a service implementation */
        override def functionToService(f: FunctionType): ServiceType = ???

        /** Convert a service implementation of this method into a function implementation */
        override def serviceToFunction(svc: ServiceType): FunctionType = ???

        /** Thrift service name. A thrift service is a list of methods. */
        override val serviceName: String = "FooService"

        /** Codec for the request args */
        override def argsCodec: ThriftStructCodec3[Args] = ???

        /** Codec for the response */
        override def responseCodec: ThriftStructCodec3[Result] = ???

        /** True for oneway thrift methods */
        override val oneway: Boolean = false
      }

      val prettyString = ThriftMethodUtils.prettyStr(method)
      prettyString should be("FooService.Foo")
    }
  }
}
