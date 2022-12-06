
import Link from 'next/link';
import React from 'react';

export default function ProductItem({ product: event, addToCartHandler }) {
  return (
    <div className="card">
      <Link href={`/product/${event.slug}`}>
        <a>
          <img
            src={event.image}
            alt={event.name}
            className="rounded shadow"
          />
        </a>
      </Link>
      <div className="flex flex-col items-center justify-center p-5">
        <Link href={`/product/${event.slug}`}>
          <a>
            <h2 className="text-lg">{event.name}</h2>
          </a>
        </Link>
        <p className="mb-2">{event.brand}</p>
        <p>${event.price}</p>
        <button
          className="primary-button"
          type="button"
          onClick={() => addToCartHandler(event)}
        >
          Add to cart
        </button>
      </div>
    </div>
  );
}
