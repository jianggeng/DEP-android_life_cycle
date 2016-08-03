package com.jgeng.Lifecycle;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jgeng on 8/1/16.
 */

public class TestFragment extends Fragment {
  private static final String TAG = "Lifecycle Fragment";
  @Override
  public void onAttach(Context context) {
    Log.e(TAG, "onAttach {");
    super.onAttach(context);
    Log.e(TAG, "onAttach }");
  }

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    Log.e(TAG, "onCreate Start");
    super.onCreate(savedInstanceState);
    Log.e(TAG, "onCreate end");
  }

  @Override
  public View onCreateView(LayoutInflater inflater,
                           ViewGroup container,
                           Bundle savedInstanceState) {
    Log.e(TAG, "onCreateView");
    return inflater.inflate(R.layout.fragment_test, container,false);
  }

  @Override
  public void onActivityCreated (Bundle savedInstanceState) {
    Log.e(TAG, "onActivityCreated");
    super.onActivityCreated(savedInstanceState);
    Log.e(TAG, "onActivityCreated end");
  }


  @Override
  public void onResume() {
    Log.e(TAG, "onResume {");
    super.onResume();
    Log.e(TAG, "onResume }");
  }

  @Override
  public void onPause() {
    Log.e(TAG, "onPause {");
    super.onPause();
    Log.e(TAG, "onPause }");
  }

  @Override
  public void onStop() {
    Log.e(TAG, "onStop {");
    super.onStop();
    Log.e(TAG, "onStop }");
  }

  @Override
  public void onDestroy() {
    Log.e(TAG, "onDestroy {");
    super.onDestroy();
    Log.e(TAG, "onDestroy }");
  }
}
