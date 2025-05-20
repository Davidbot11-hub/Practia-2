import { ViewConfig } from '@vaadin/hilla-file-router/types.js';
import { Button, DatePicker, Grid, GridColumn, TextField } from '@vaadin/react-components';
import { Notification } from '@vaadin/react-components/Notification';

import { useSignal } from '@vaadin/hilla-react-signals';
import handleError from 'Frontend/views/_ErrorHandler';
import { Group, ViewToolbar } from 'Frontend/components/ViewToolbar';

import { useDataProvider } from '@vaadin/hilla-react-crud';
import { GeneroService} from 'Frontend/generated/endpoints';
import genero from 'Frontend/generated/com/practica/dos/base/models/genero';

export const config: ViewConfig = {
  title: 'Genero',
  menu: {
    icon: 'vaadin:clipboard-check',
    order: 2,
    title: 'Genero',
  },
};

const dateFormatter = new Intl.DateTimeFormat(undefined, {
  dateStyle: 'medium',
});



export default function generoLisView() {
  const dataProvider = useDataProvider<genero>({
    list: () => GeneroService.ListAllgenero(),
  });

  return (
    <main className="w-full h-full flex flex-col box-border gap-s p-m">
      <ViewToolbar title="Generos">
        <Group>
         
        </Group>
      </ViewToolbar>
      <Grid dataProvider={dataProvider.dataProvider}>
        <GridColumn path="id" header="id"/>
        <GridColumn path="nombre" header="Nombre">
        
          {/* {({ item }) => (item.dueDate ? dateFormatter.format(new Date(item.dueDate)) : 'Never')} */}
        </GridColumn>
        {/* <GridColumn path="creationDate" header="Creation Date">
          {({ item }) => dateTimeFormatter.format(new Date(item.creationDate))}
        </GridColumn> */}
      </Grid>

    </main>
  );
}