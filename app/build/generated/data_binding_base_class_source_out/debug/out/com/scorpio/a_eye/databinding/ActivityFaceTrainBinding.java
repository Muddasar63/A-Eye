// Generated by view binder compiler. Do not edit!
package com.scorpio.a_eye.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.scorpio.a_eye.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFaceTrainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView btnBack;

  @NonNull
  public final ImageFilterView btnCapture;

  @NonNull
  public final ImageFilterView btnSwitchCamera;

  @NonNull
  public final EditText personName;

  @NonNull
  public final PreviewView previewView;

  @NonNull
  public final View topBarView;

  private ActivityFaceTrainBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView btnBack,
      @NonNull ImageFilterView btnCapture, @NonNull ImageFilterView btnSwitchCamera,
      @NonNull EditText personName, @NonNull PreviewView previewView, @NonNull View topBarView) {
    this.rootView = rootView;
    this.btnBack = btnBack;
    this.btnCapture = btnCapture;
    this.btnSwitchCamera = btnSwitchCamera;
    this.personName = personName;
    this.previewView = previewView;
    this.topBarView = topBarView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFaceTrainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFaceTrainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_face_train, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFaceTrainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_back;
      ImageView btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btn_capture;
      ImageFilterView btnCapture = ViewBindings.findChildViewById(rootView, id);
      if (btnCapture == null) {
        break missingId;
      }

      id = R.id.btn_switch_camera;
      ImageFilterView btnSwitchCamera = ViewBindings.findChildViewById(rootView, id);
      if (btnSwitchCamera == null) {
        break missingId;
      }

      id = R.id.person_name;
      EditText personName = ViewBindings.findChildViewById(rootView, id);
      if (personName == null) {
        break missingId;
      }

      id = R.id.preview_view;
      PreviewView previewView = ViewBindings.findChildViewById(rootView, id);
      if (previewView == null) {
        break missingId;
      }

      id = R.id.top_bar_view;
      View topBarView = ViewBindings.findChildViewById(rootView, id);
      if (topBarView == null) {
        break missingId;
      }

      return new ActivityFaceTrainBinding((ConstraintLayout) rootView, btnBack, btnCapture,
          btnSwitchCamera, personName, previewView, topBarView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
