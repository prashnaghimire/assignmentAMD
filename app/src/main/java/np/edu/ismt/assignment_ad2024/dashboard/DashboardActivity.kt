package np.edu.ismt.assignment_ad2024.dashboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import np.edu.ismt.assignment_ad2024.CatagoriesFragment
import np.edu.ismt.assignment_ad2024.HomeFragment
import np.edu.ismt.assignment_ad2024.MyItemsFragment
import np.edu.ismt.assignment_ad2024.ProfileFragment
import np.edu.ismt.assignment_ad2024.R
import np.edu.ismt.assignment_ad2024.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding
    private var fragmentManager = supportFragmentManager
    private var homeFragment = HomeFragment()
    private var MyItemsFragment= MyItemsFragment()
    private var CatagoriesFragment= CatagoriesFragment()
    private var profileFragment= ProfileFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityDashboardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        loadRespectiveFragment(homeFragment);

        binding.bottomNav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home -> {
                    loadRespectiveFragment(homeFragment);
                    true}
                R.id.my_items -> {
                    loadRespectiveFragment(MyItemsFragment);
                    true
                }
                R.id.catagories -> {
                    loadRespectiveFragment(CatagoriesFragment);
                    true
                }
                R.id.profile -> {
                    loadRespectiveFragment(profileFragment);
                    true
                }
                else -> {
                    true
                }
            }
        }
    }
    private fun loadRespectiveFragment(fragment: Fragment){
        fragmentManager.beginTransaction()
            .replace(
                binding.fcView.id,
                fragment,
                null
            )
            .setReorderingAllowed(true)
            .addToBackStack(null)
            .commit()
    }



        }
