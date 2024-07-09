package jp.ac.ritsumei.ise.phy.exp2.is0666fv.hotelmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private MyHotelApplication myHotelApp = (MyHotelApplication) getApplication();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        myHotelApp.saveRoomManagement();
    }

    //Menu:Room Management,
    public void roomManagementTapped(View view){
        Intent intent = new Intent(this, SelectFloorView.class);
        startActivity(intent);
    }

    public void failureEquipmentListButtonTapped(View view){
        Intent intent = new Intent(this, FailureEquipmentListView.class);
        startActivity(intent);
    }

    public void lostPropertyListButtonTapped(View view){
        Intent intent = new Intent(this, LostPropertyList.class);
        startActivity(intent);
    }
}