package lol.saba.common.messages.impl

import kotlinx.serialization.Serializable
import lol.saba.common.ClientRole
import lol.saba.common.messages.SabaMessage

@Serializable
data class Identify(val role: ClientRole) : SabaMessage {
    @Serializable
    data class Actor(val userId: Long) : SabaMessage
}
