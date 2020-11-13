package workshop.hotels.reservations.domain.models.events

import workshop.hotels.infrastructure.eventstore.abstractions.IEvent
import java.util.*

//virtual workshop ex-5 hint
class ReservationNotMade(override val id: UUID, val hotelId: UUID, val roomType: String, val reason: String): IEvent