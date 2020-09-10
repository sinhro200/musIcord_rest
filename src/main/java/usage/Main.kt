package usage

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.ObjectNode
import rest.CreateRoomReqData
import rest.core.CommonRequest

class Main {
    private fun test() {
        val mapper = ObjectMapper()
        val on: ObjectNode = mapper.createObjectNode()

        val cr = CommonRequest(CreateRoomReqData("testRoom"))

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