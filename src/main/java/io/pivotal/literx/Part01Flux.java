package io.pivotal.literx;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import reactor.core.publisher.Flux;

/**
 * Learn how to create Flux instances.
 *
 * @author Sebastien Deleuze
 * @see <a href="https://projectreactor.io/docs/core/release/api/reactor/core/publisher/Flux.html">Flux Javadoc</a>
 */
public class Part01Flux {

//========================================================================================

	// TODO Return an empty Flux
	Flux<String> emptyFlux() {
		return Flux.empty();
	}

//========================================================================================

	// TODO Return a Flux that contains 2 values "foo" and "bar" without using an array or a collection
	Flux<String> fooBarFluxFromValues() {
		return Flux.just("foo", "bar");
	}

//========================================================================================

	// TODO Create a Flux from a List that contains 2 values "foo" and "bar"
	Flux<String> fooBarFluxFromList() {
		List<String> list = new ArrayList<>();
		list.add("foo");
		list.add("bar");
		return Flux.fromIterable(list);
	}

//========================================================================================

	// TODO Create a Flux that emits an IllegalStateException
	Flux<String> errorFlux() {
		return Flux.error(new IllegalStateException());
	}

//========================================================================================

		// TODO Create a Flux that emits increasing values from 0 to 9 each 100ms
	Flux<Long> counter() {
		Duration period = Duration.of(100L, ChronoUnit.MILLIS);
		//return Flux.interval(period).take(10L);

		return Flux.just(0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L);
	}

}
