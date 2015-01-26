package com.jnape.palatable.lambda.applicative;

import com.jnape.palatable.lambda.functions.MonadicFunction;

public interface Functor<A> {

    <B> Functor<B> fmap(MonadicFunction<? super A, ? extends B> fn);
}
