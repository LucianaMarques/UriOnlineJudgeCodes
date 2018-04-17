select products.name, providers.name
from products
inner join providers on products.id_providers = providers.id and providers.name = 'Ajax SA';
