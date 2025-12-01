package de.westnordost.streetcomplete.quests.aerialway

import de.westnordost.streetcomplete.R
import de.westnordost.streetcomplete.data.osm.geometry.ElementGeometry
import de.westnordost.streetcomplete.data.osm.osmquests.OsmFilterQuestType
import de.westnordost.streetcomplete.data.quest.AndroidQuest
import de.westnordost.streetcomplete.data.user.achievements.EditTypeAchievement.OUTDOORS
import de.westnordost.streetcomplete.osm.Tags
import de.westnordost.streetcomplete.quests.aerialway.BoatLockSelfServiceAnswer.YES
import de.westnordost.streetcomplete.quests.aerialway.BoatLockSelfServiceAnswer.PARTIALLY
import de.westnordost.streetcomplete.quests.aerialway.BoatLockSelfServiceAnswer.ONLY
import de.westnordost.streetcomplete.quests.aerialway.BoatLockSelfServiceAnswer.NO

class AddBoatLockSelfService : OsmFilterQuestType<BoatLockSelfServiceAnswer>(), AndroidQuest {

    override val elementFilter = """ ways with lock=yes and !self_service """

    override val changesetComment = "Specify if a boat lock is self service or no"
    override val wikiLink = "Tag:lock"
    override val icon = R.drawable.ic_quest_lock_boat
    override val achievements = listOf(OUTDOORS)

    override fun getTitle(tags: Map<String, String>) = R.string.quest_boat_lock_self_service_title

    override fun createForm() = BoatLockSelfServiceForm()

    override fun applyAnswerTo(answer: BoatLockSelfServiceAnswer, tags: Tags, geometry: ElementGeometry, timestampEdited: Long) {
        when (answer) {
            YES -> tags["lock:self_service"] = "yes"
            PARTIALLY -> tags["lock:self_service"] = "partially"
            ONLY -> tags["lock:self_service"] = "only"
            NO -> tags["lock:self_service"] = "no"
        }
    }
}
