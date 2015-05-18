package com.hasie;

import com.google.common.base.Preconditions;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * use newBuilder() method for building instance of this class
 */
public final class MultilingualString implements Serializable {

	@Nonnull
	private final Map<Integer, String> names;

	private MultilingualString(@Nonnull Map<Integer, String> names) {
		this.names = Preconditions.checkNotNull(names);
	}

	@Nullable
	public String getValue(@Nonnull Integer languageId) {
		return names.get(Preconditions.checkNotNull(languageId));
	}

	public boolean isEmpty() {
		for (String value : names.values()) {
			if (value != null && !value.isEmpty()) {
				return false;
			}
		}
		return true;
	}

	@Nonnull
	public static MultilingualStringBuilder newBuilder() {
		return new MultilingualStringBuilder();
	}


	public static class MultilingualStringBuilder {
		private final Map<Integer, String> data;

		private MultilingualStringBuilder() {
			this.data = new HashMap<>();
		}

		@Nonnull
		public MultilingualStringBuilder with(@Nonnull Integer languageId, @Nullable String value) {
			data.put(Preconditions.checkNotNull(languageId), value);
			return this;
		}

		@Nonnull
		public MultilingualStringBuilder withSameStringForAllLanguages(@Nonnull String value, @Nonnull List<Integer> languages) {
			Preconditions.checkNotNull(value);
			for (Integer languageId : Preconditions.checkNotNull(languages)) {
				data.put(Preconditions.checkNotNull(languageId), value);
			}
			return this;
		}

		@Nonnull
		public MultilingualString build() {
			return new MultilingualString(data);
		}

	}
}

