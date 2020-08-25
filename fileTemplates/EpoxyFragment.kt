#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.airbnb.epoxy.TypedEpoxyController
import dk.makeable.mkuniverset.R
import kotlinx.android.synthetic.main.fragment_shared_epoxy.*

#end
#parse("File Header.java")
class ${NAME}EpoxyController: TypedEpoxyController<$DataType>() {
    override fun buildModels(data: $DataType?) {
        if (data != null) {
            
        }
    }
}

class ${NAME} : Fragment() {
    private val controller = ${NAME}EpoxyController()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setupUI()
    }

    private fun setupUI() {
        setupRecycler()

        loadData()
    }

    private fun setupRecycler() {
        epoxy_recycler.setController(controller)
    }

    private fun loadData() {
        controller.setData()
    }
}