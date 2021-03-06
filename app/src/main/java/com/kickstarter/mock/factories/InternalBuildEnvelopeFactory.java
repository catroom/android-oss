package com.kickstarter.mock.factories;

import android.support.annotation.NonNull;

import com.kickstarter.services.apiresponses.InternalBuildEnvelope;

public final class InternalBuildEnvelopeFactory {
  private InternalBuildEnvelopeFactory() {}

  public static @NonNull InternalBuildEnvelope internalBuildEnvelope() {
    return InternalBuildEnvelope.builder()
      .build(123456)
      .changelog("Bug fixes")
      .newerBuildAvailable(false)
      .build();
  }

  public static @NonNull InternalBuildEnvelope newerBuildAvailable() {
    return internalBuildEnvelope().toBuilder()
      .newerBuildAvailable(true)
      .build();
  }
}
