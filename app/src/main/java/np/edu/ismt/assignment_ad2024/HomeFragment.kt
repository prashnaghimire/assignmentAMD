package np.edu.ismt.assignment_ad2024

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import np.edu.ismt.assignment_ad2024.dashboard.Product
import np.edu.ismt.assignment_ad2024.dashboard.adapters.SuggestionsHorizontalAdapter
import np.edu.ismt.assignment_ad2024.databinding.ActivityDashboardBinding
import np.edu.ismt.assignment_ad2024.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(
            layoutInflater,
            container,
            false
        )
        setUpSuggestionsRecycleView()
        return binding.root
    }

    private val setUpSuggestionsRecycleView()
        private fun getSuggestions(): List<Product> {


            val adapter = SuggestionsHorizontalAdapter(
                getSuggestions()
            )
            binding.rvSuggestions.layoutManager = LinearLayoutManager(
                requireActivity(),
                LinearLayoutManager.HORIZONTAL,
                false
            )
            binding.rvSuggestions.adapter = adapter

        }

        private fun setUpSuggestionsRecycleView(): MutableList<Product> {
            val suggestions = mutableListOf<Product>()

            val suggestion1 = Product(
                name = "Item 1",
                price = "400",
                description = "description 1"
            )
            suggestions.add(suggestion1)


            val suggestion3 = Product(
                name = "Item 3",
                price = "400",
                description = "description 3"
            )
            suggestions.add(suggestion3)

            return suggestions
        }

    }






