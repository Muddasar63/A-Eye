// Generated by view binder compiler. Do not edit!
package com.scorpio.a_eye.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.scorpio.a_eye.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutHistoryDetailsItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageFilterView imageView;

  @NonNull
  public final ImageFilterView imageViewAdd;

  private LayoutHistoryDetailsItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageFilterView imageView, @NonNull ImageFilterView imageViewAdd) {
    this.rootView = rootView;
    this.imageView = imageView;
    this.imageViewAdd = imageViewAdd;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutHistoryDetailsItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutHistoryDetailsItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_history_details_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutHistoryDetailsItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.image_view;
      ImageFilterView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.image_view_add;
      ImageFilterView imageViewAdd = ViewBindings.findChildViewById(rootView, id);
      if (imageViewAdd == null) {
        break missingId;
      }

      return new LayoutHistoryDetailsItemBinding((ConstraintLayout) rootView, imageView,
          imageViewAdd);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
