package com.dfusetech.BLE4.ble4;

import android.app.Activity;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanSettings;
import com.dfusetech.BLE4.ble4.R;

public class FindDevices extends Activity {
public ScanSettings _scanSettings;
public BluetoothLeScanner _leScanner;
    public ScanFilter _scanFilter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_devices);
        ConfigureSettings();
        ConfigureScanner();
        ConfigureFilter();
        RunScan(_scanFilter,_leScanner,_scanSettings);
    }
public ScanSettings ConfigureSettings() {
        /*NO IDEA HOW TO USE THIS :)
        * Need to setup the values for _scanSettings
        */
    return _scanSettings;
}
public BluetoothLeScanner ConfigureScanner ()
{
    /*
    setup the scanner w/ options
     */
    return _leScanner;
}
    public ScanFilter ConfigureFilter ()
    {
    /*
    setup the scanfilter
     */
        return _scanFilter;
    }
public void RunScan(ScanFilter scanFilter, BluetoothLeScanner leScanner, ScanSettings scanSettings) {
    /*leScanner.startScan(scanFilter,scanSettings,CALLBACKMETHOD);*/
    /*for each found item with UUID == R.string.BLE_UUID add it to the R.id.listFoundDevices */
}



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.find_devices, menu);
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
