package usage

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.ObjectNode
import rest.request_response.RegisterRespBody
import rest.core.CommonResponse

class Main {
    private fun test() {
        val mapper = ObjectMapper()
        val on: ObjectNode = mapper.createObjectNode()

        var cr:CommonResponse<Any> = CommonResponse.buildError(Int.MAX_VALUE,"asd")
        cr = CommonResponse.buildSuccess(RegisterRespBody("success"))


        val jsonNode: JsonNode = mapper.valueToTree(cr)

        System.out.println(jsonNode)
    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Main().test()
        }
    }
}