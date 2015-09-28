package zerobase.us.fulltime.base;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import zerobase.us.fulltime.interfaces.FragmentSwitch;

/**
 * This is the class that acts as the base for all the activities.
 * Created by Sripadmanaban on 9/14/2015.
 */
public class BaseActivity extends AppCompatActivity implements FragmentSwitch {

    protected int fragmentContainerID;

    @Override
    public void switchToFragment(Fragment fragment, boolean addToBackStack) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        if(addToBackStack) {
            transaction.addToBackStack(null);
        }
        transaction.replace(fragmentContainerID, fragment, fragment.getClass().getName());
        transaction.commit();
    }
}
