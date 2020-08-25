#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import dk.makeable.mkuniverset.util.epoxy.KotlinEpoxyHolder

#end
#parse("File Header.java")
@EpoxyModelClass(layout = layoutId)
abstract class ${NAME} : EpoxyModelWithHolder<${NAME}.Holder>() {

    @EpoxyAttribute lateinit var attr: String

    override fun bind(holder: Holder) {

    }

    class Holder: KotlinEpoxyHolder() {

    }

}