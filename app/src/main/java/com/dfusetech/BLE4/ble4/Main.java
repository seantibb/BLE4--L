package com.dfusetech.BLE4.ble4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.bluetooth.BluetoothAdapter;

public class Main extends Activity {
    private BluetoothAdapter mBluetoothAdapter;
    private Button _btnFindDevices, _btnSendPhoneData;

    /*############################################################
        GETTING NULL POINTER EXCEPTION AND IMMEDIATE CRASH WITH THESE

    public TextView tvBluetoothSupported = (TextView)findViewById(R.id.textBluetoothSupported);
    public TextView tvBLESupported = (TextView)findViewById(R.id.tvBLESupported);
    ###############################################################*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Use this check to determine whether BLE is supported on the device.  Then you can
        // selectively disable BLE-related features.
        if (!getPackageManager().hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE)) {
            //tvBLESupported.setText(R.string.ble_not_supported);
        }
        else{
            //tvBLESupported.setText("GOOD NEWS:  BLE is supported");
        }

        // Initializes a Bluetooth adapter.  For API level 18 and above, get a reference to
        // BluetoothAdapter through BluetoothManager.
            final BluetoothManager bluetoothManager =
                (BluetoothManager) getSystemService(Context.BLUETOOTH_SERVICE);
        mBluetoothAdapter = bluetoothManager.getAdapter();

        // Checks if Bluetooth is supported on the device.
        if (mBluetoothAdapter == null) {
            //tvBluetoothSupported.setText(R.string.error_bluetooth_not_supported);
        }
        else{
            //tvBluetoothSupported.setText("Bluetooth is supported");
        }


        _btnFindDevices = (Button) findViewById(R.id.btnFindDevices);
        _btnFindDevices
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent finddevicesIntent = new Intent(
                                "com.dfusetech.BLE4.ble4.FindDevices");
                        startActivity(finddevicesIntent);
                    }
                });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
